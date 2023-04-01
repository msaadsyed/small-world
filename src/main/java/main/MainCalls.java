package main;

import pageObjects.Dashboard_PO;
import pageObjects.Saucedemo_Login_PO;

public class MainCalls {

    private static Saucedemo_Login_PO sd_login_PO;

    public static Saucedemo_Login_PO getSd_LoginPO(){
        if(sd_login_PO == null){
            sd_login_PO = new Saucedemo_Login_PO();
        }
        return sd_login_PO;
    }

    private static Dashboard_PO sd_dashboar_PO;

    public static Dashboard_PO getSd_DashboardPO(){
        if(sd_dashboar_PO == null){
            sd_dashboar_PO = new Dashboard_PO();
        }
        return sd_dashboar_PO;
    }
}
