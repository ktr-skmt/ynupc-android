package jp.ac.ynu.pc.enums;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/05/01
 * Time: 23:29
 * To change this template use File | Settings | File Templates.
 */
public enum Room {
    ALL("all"),
    LIBRARY_2F_PC("P-1"),
    LIBRARY_2F_REF("P-2"),
    LIBRARY_3F_PC("Q"),
    LIBRARY_1F_MEDIA("U"),
    LIBRARY_WORKING_STUDIO("W"),
    SCIENCE_LIBRARY("R"),
    MACHINE_SHOP_A("A"),
    MACHINE_SHOP_B("B"),
    MACHINE_SHOP_C("C"),
    MACHINE_SHOP_D("D"),
    MACHINE_SHOP_E("E"),
    MACHINE_SHOP_F("F"),
    ECON_NEW_RESEARCH_301("G"),
    BUSINESS_RESEARCH_303("H"),
    EDHS_RESEARCH2_517("I"),
    EDUCATION_DESIGN("J"),
    DNJ_1F("K"),
    DNJ_3F_1("L"),
    DNJ_3F_2("M"),
    MECHANICAL("N"),
    GENERAL_RESEARCH_W204("O"),
    INTERNATIONAL_STUDENT_CENTER("T");


    private final String roomName;
    private Room(String roomName){
        this.roomName = roomName;
    }

    public String getRoomName(){
        return roomName;
    }

    public static Room roomNameOf(String name){
        Room[] rooms = values();
        for(Room room : rooms){
            if(room.getRoomName().equals(name)){
                return room;
            }
        }

        return null;
    }
}
