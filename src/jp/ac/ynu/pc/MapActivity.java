package jp.ac.ynu.pc;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.actionbarsherlock.app.SherlockActivity;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.qozix.mapview.MapView;
import jp.ac.ynu.pc.enums.Room;
import jp.ac.ynu.pc.models.MultiRoom;
import jp.ac.ynu.pc.models.RoomInfo;
import jp.ac.ynu.pc.models.SingleRoom;
import jp.ac.ynu.pc.utils.ApiRequest;
import jp.ac.ynu.pc.utils.ConnectionUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapActivity extends SherlockActivity {
    private MapView mapView;
    private Map<Room, RoomInfo> roomInfoHashMap = new HashMap<Room, RoomInfo>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mapView = new MapView(this);

        setContentView(mapView);

        mapView.addZoomLevel(370, 585, "ja/tiles/125-%col%-%row%.jpg", "ja/downsamples/map.jpg");
        mapView.addZoomLevel(740, 1170, "ja/tiles/250-%col%-%row%.jpg", "ja/downsamples/map.jpg");
        mapView.addZoomLevel(1480, 2340, "ja/tiles/500-%col%-%row%.jpg", "ja/downsamples/map.jpg");
        mapView.addZoomLevel(2980, 4680, "ja/tiles/1000-%col%-%row%.jpg", "ja/downsamples/map.jpg");

        mapView.setShouldIntercept(true);
        mapView.setCacheEnabled(false);

        mapView.setZoom(1);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (!ConnectionUtils.isConnected(this)) {
            new AlertDialog.Builder(this)
                    .setTitle(R.string.app_name)
                    .setMessage(R.string.dialog_network_disconnected)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .show();
        } else {
            fetchMapInformation();
            addHotSpots();
        }
    }

    private void fetchMapInformation() {
        ApiRequest.getMapInformation(new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(String s) {
                super.onSuccess(s);

                try {
                    JSONObject response = new JSONObject(s);
                    for (Room room : Room.values()) {
                        try {
                            JSONObject roomInfoJson = response.getJSONObject(room.getRoomName());

                            roomInfoHashMap.put(room, new SingleRoom(room, roomInfoJson));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                    ApiRequest.getRoomInformation(Room.ALL, new AsyncHttpResponseHandler() {
                        @Override
                        public void onSuccess(String s) {
                            super.onSuccess(s);

                            try {
                                JSONObject response = new JSONObject(s);
                                for (Room room : Room.values()) {
                                    try {
                                        JSONObject roomInfoJson = response.getJSONObject(room.getRoomName());

                                        if (!roomInfoHashMap.containsKey(room)) {
                                            continue;
                                        }

                                        RoomInfo roomInfo = roomInfoHashMap.get(room);
                                        roomInfo.setRoomJSON(roomInfoJson);

                                        roomInfoHashMap.put(room, roomInfo);
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }

                        @Override
                        public void onFailure(Throwable throwable, String s) {
                            super.onFailure(throwable, s);
                        }
                    });
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Throwable throwable, String s) {
                super.onFailure(throwable, s);
                throwable.printStackTrace();
            }
        });
    }

    private void addHotSpots() {
        for (int i = 0; i < hotSpots.length; ++i) {
            mapView.removeHotSpot(hotSpots[i], listeners[i]);
            mapView.addHotSpot(hotSpots[i], listeners[i]);
        }
    }

    private Rect hotSpots[] = {
            new Rect(513, 469, 240 + 513, 220 + 469),
            new Rect(1487, 1069, 1487 + 171, 1069 + 222),
            new Rect(2046, 1090, 2046 + 155, 1090 + 395),
            new Rect(2045, 1502, 191 + 2045, 235 + 1502),
            new Rect(1081, 1560, 1081 + 228, 1560 + 163),
            new Rect(1175, 1751, 1175 + 186, 1751 + 179),
            new Rect(1184, 2129, 1184 + 415, 2129 + 293),
            new Rect(1303, 1890, 195 + 1303, 219 + 1890),
            new Rect(1040, 2531, 230 + 1040, 293 + 2531),
            new Rect(1299, 3027, 1299 + 182, 3027 + 175),
            new Rect(2309, 2676, 2309 + 159, 2676 + 141),
            new Rect(2355, 3071, 2355 + 132, 3071 + 191),
            new Rect(1638, 3707, 153 + 1638, 116 + 3707)
    };

    // できればIDで分けてonClickの中でswitch文使いたい…。
    private View.OnClickListener listeners[] = {
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    List<RoomInfo> infoList = new ArrayList<RoomInfo>();
                    infoList.add(roomInfoHashMap.get(Room.GENERAL_RESEARCH_W204));
                    new RoomInfoDialog(MapActivity.this, R.string.bldg_general_research, infoList).show();
                }
            },
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    List<RoomInfo> infoList = new ArrayList<RoomInfo>();
                    infoList.add(roomInfoHashMap.get(Room.SCIENCE_LIBRARY));
                    new RoomInfoDialog(MapActivity.this, R.string.bldg_science_library, infoList).show();
                }
            },
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    List<RoomInfo> infoList = new ArrayList<RoomInfo>();
                    infoList.add(roomInfoHashMap.get(Room.MECHANICAL));
                    new RoomInfoDialog(MapActivity.this, R.string.bldg_mechanical_engineering, infoList).show();

                }
            },
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    List<RoomInfo> infoList = new ArrayList<RoomInfo>();
                    infoList.add(roomInfoHashMap.get(Room.DNJ_1F));
                    infoList.add(roomInfoHashMap.get(Room.DNJ_3F_1));
                    infoList.add(roomInfoHashMap.get(Room.DNJ_3F_2));
                    new RoomInfoDialog(MapActivity.this, R.string.bldg_computer_engineering, infoList).show();
                }
            },

            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    List<RoomInfo> infoList = new ArrayList<RoomInfo>();
                    infoList.add(roomInfoHashMap.get(Room.MACHINE_SHOP_A));
                    infoList.add(roomInfoHashMap.get(Room.MACHINE_SHOP_B));
                    new RoomInfoDialog(MapActivity.this, R.string.bldg_itsc, infoList).show();
                }
            },

            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    List<RoomInfo> infoList = new ArrayList<RoomInfo>();
                    infoList.add(roomInfoHashMap.get(Room.MACHINE_SHOP_E));
                    new RoomInfoDialog(MapActivity.this, R.string.bldg_itsc, infoList).show();
                }
            },
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    List<RoomInfo> infoList = new ArrayList<RoomInfo>();
                    infoList.add(roomInfoHashMap.get(Room.MACHINE_SHOP_F));
                    infoList.add(roomInfoHashMap.get(Room.LIBRARY_2F_REF));
                    infoList.add(roomInfoHashMap.get(Room.LIBRARY_2F_PC));
                    infoList.add(roomInfoHashMap.get(Room.LIBRARY_3F_PC));
                    infoList.add(roomInfoHashMap.get(Room.LIBRARY_1F_MEDIA));
                    infoList.add(roomInfoHashMap.get(Room.LIBRARY_WORKING_STUDIO));
                    new RoomInfoDialog(MapActivity.this, R.string.bldg_central_library, infoList).show();
                }
            }
            ,
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    List<RoomInfo> infoList = new ArrayList<RoomInfo>();
                    infoList.add(
                            new MultiRoom(Room.MACHINE_SHOP_CD, R.string.machine_shop_cd, roomInfoHashMap.get(Room.MACHINE_SHOP_C), roomInfoHashMap.get(Room.MACHINE_SHOP_D)));
                    new RoomInfoDialog(MapActivity.this, R.string.bldg_itsc_annex, infoList).show();
                }
            }
            ,
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    List<RoomInfo> infoList = new ArrayList<RoomInfo>();
                    infoList.add(roomInfoHashMap.get(Room.EDHS_RESEARCH2_517));
                    new RoomInfoDialog(MapActivity.this, R.string.bldg_edhs_research, infoList).show();
                }
            }
            ,
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    List<RoomInfo> infoList = new ArrayList<RoomInfo>();
                    infoList.add(roomInfoHashMap.get(Room.EDUCATION_DESIGN));
                    new RoomInfoDialog(MapActivity.this, R.string.bldg_education_desingn, infoList).show();
                }
            },
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    List<RoomInfo> infoList = new ArrayList<RoomInfo>();
                    infoList.add(roomInfoHashMap.get(Room.ECON_NEW_RESEARCH_301));
                    new RoomInfoDialog(MapActivity.this, R.string.bldg_econ_new_research, infoList).show();
                }
            }
            ,
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    List<RoomInfo> infoList = new ArrayList<RoomInfo>();
                    infoList.add(roomInfoHashMap.get(Room.BUSINESS_RESEARCH_303));
                    new RoomInfoDialog(MapActivity.this, R.string.bldg_business_research, infoList).show();
                }
            }
            ,
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    List<RoomInfo> infoList = new ArrayList<RoomInfo>();
                    infoList.add(roomInfoHashMap.get(Room.INTERNATIONAL_STUDENT_CENTER));
                    new RoomInfoDialog(MapActivity.this, R.string.bldg_international_student_center, infoList).show();
                }
            }
    };
}
