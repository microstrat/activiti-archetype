#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.demo;

import com.activiti.domain.idm.User;
import com.activiti.security.SecurityUtils;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by RStoops on 9/16/2015.
 *
 */
public class SampleTaskListener implements TaskListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleTaskListener.class);

    private Logger logger = LOGGER;

    @Override
    public void notify(DelegateTask delegateTask) {
        getLogger().debug("In TaskListener for task {}", delegateTask.getEventName());
        User currentUser = SecurityUtils.getCurrentUserObject();

        delegateTask.setVariable("currentUserEmailAddress", currentUser.getEmail());
        getLogger().info(currentUser.getEmail());
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
