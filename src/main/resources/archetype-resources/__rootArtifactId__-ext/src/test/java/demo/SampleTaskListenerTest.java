#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.demo;

import com.activiti.domain.idm.User;
import com.activiti.security.SecurityUtils;
import org.activiti.engine.delegate.DelegateTask;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

import static org.mockito.Mockito.when;

public class SampleTaskListenerTest {
    @Mock
    private User curUser;
    @Mock
    private Logger logger;
    @Mock
    private DelegateTask delegateTask;

    private String emailAddress = "email address of user";
    private SampleTaskListener taskListener;

    @Before
    public void setup() throws Exception {
        MockitoAnnotations.initMocks(this);

        setupCurrentUser();
        setupTestHarness();
    }

    private void setupCurrentUser() {
        SecurityUtils.assumeUser(curUser);

        when(curUser.getEmail()).thenReturn(emailAddress);
    }

    private void setupTestHarness() {
        taskListener = new SampleTaskListener();
        taskListener.setLogger(logger);
    }

    @Test
    public void notifyShouldLogUserEmailAddressWithAdditionalText() throws Exception {
        taskListener.notify(delegateTask);
        Mockito.verify(logger).info(emailAddress);
    }
}
