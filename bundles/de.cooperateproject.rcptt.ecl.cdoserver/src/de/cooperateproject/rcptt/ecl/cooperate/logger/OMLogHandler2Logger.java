package de.cooperateproject.rcptt.ecl.cooperate.logger;

import org.eclipse.net4j.util.om.log.OMLogHandler;
import org.eclipse.net4j.util.om.log.OMLogger;
import org.eclipse.net4j.util.om.log.OMLogger.Level;
import org.slf4j.Logger;

public class OMLogHandler2Logger implements OMLogHandler  {

    Logger logger;
    
    public OMLogHandler2Logger(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void logged(OMLogger omLogger, Level level, String msg, Throwable t) {
        switch (level) {
        case DEBUG:
            logger.debug(msg, t);
            break;
        case ERROR:
            logger.error(msg, t);
            break;
        case INFO:
            logger.info(msg, t);
            break;
        case WARN:
            logger.warn(msg, t);
            break;
        default:
            logger.trace(msg, t);
            break;        
        }
    }
    
   

}
