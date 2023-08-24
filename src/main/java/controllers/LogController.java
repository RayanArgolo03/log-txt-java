
package controllers;

import services.LogService;


public class LogController {
    
    private static LogController instance;
    private LogService logService;

    private LogController() {}
    
    public static LogController getInstance(){
        if (instance == null) instance = new LogController();
        return instance;
    }

    public LogService getLogService() {
        return logService;
    }

    public void setLogService(LogService logService) {
        this.logService = logService;
    }
    
}
