package jp.ac.ynu.pc.maps;

import jp.ac.ynu.pc.models.RoomInfo;

/**
 * Created with IntelliJ IDEA.
 * User: kosasa
 * Date: 2013/06/18
 * Time: 20:11
 * To change this template use File | Settings | File Templates.
 */
public class RoomMapFactory {
    public static RoomMap getRoomMap(RoomInfo roomInfo) {
        switch (roomInfo.getRoom()) {
            case MACHINE_SHOP_A:
                return new MachineShopA(roomInfo);
            case MACHINE_SHOP_B:
                return new MachineShopB(roomInfo);
            case MACHINE_SHOP_E:
                return new MachineShopE(roomInfo);
            case MACHINE_SHOP_F:
                return new MachineShopF(roomInfo);
            case MACHINE_SHOP_CD:
                return new MachineShopCD(roomInfo);
            case ECON_NEW_RESEARCH_301:
                return new EconNewResearch(roomInfo);
            case BUSINESS_RESEARCH_303:
                return new BusinessResearch(roomInfo);
            case EDHS_RESEARCH2_517:
                return new EdhsResearch(roomInfo);
            case EDUCATION_DESIGN:
                return new EducationDesign(roomInfo);
            case DNJ_1F:
                return new ComputerLab1F(roomInfo);
            case DNJ_3F_1:
                return new ComputerLab3F1(roomInfo);
            case DNJ_3F_2:
                return new ComputerLab3F2(roomInfo);
            case MECHANICAL:
                return new MechanicalEngineering305(roomInfo);
            case GENERAL_RESEARCH_W204:
                return new GeneralResearchW204(roomInfo);
            case LIBRARY_2F_PC:
                return new Library2FPC(roomInfo);
            case LIBRARY_2F_REF:
                return new Library2FRefresh(roomInfo);
            case LIBRARY_3F_PC:
                return new Library3FPC(roomInfo);
            case LIBRARY_1F_MEDIA:
                return new Library1FMedia(roomInfo);
            case LIBRARY_WORKING_STUDIO:
                return new LibraryWorkingStudio(roomInfo);
            case SCIENCE_LIBRARY:
                return new ScienceLibrary(roomInfo);
            case INTERNATIONAL_STUDENT_CENTER:
                return new InternatinalStudentCenter(roomInfo);

        }
        return null;
    }
}
