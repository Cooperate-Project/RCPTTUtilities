package de.cooperateproject.rcptt.ecl.cooperate.logger;

import org.eclipse.net4j.util.om.trace.OMTraceHandler;
import org.eclipse.net4j.util.om.trace.OMTraceHandlerEvent;
import org.slf4j.Logger;

public class OMTraceHandler2Logger implements OMTraceHandler{

    Logger logger;
    
    public OMTraceHandler2Logger(Logger logger) {
        this.logger = logger;
    }
    
    @Override
    public void traced(OMTraceHandlerEvent event) {
        logger.trace(event.getMessage() + " - " + event.getContext(), event.getThrowable());
    }
}
