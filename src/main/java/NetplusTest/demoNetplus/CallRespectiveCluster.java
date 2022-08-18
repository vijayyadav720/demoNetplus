package NetplusTest.demoNetplus;
import org.openqa.selenium.WebDriver;

import constants.LocatorValues;
import constants.Values;
public class CallRespectiveCluster implements LocatorValues , Values{
static UtilClass util ;
static String clusterName;
static private WebDriver driver;
public CallRespectiveCluster(WebDriver driver , UtilClass util)
{
	this.driver = driver;
	this.util = util;
}

	public void switchSelect(String cluster) {
		switch (cluster) {
		case CLUSTER_BHIWANI:
			 clusterName = CLUSTER_BHIWANI;
			sendClusterValues(clusterName);
			break;
		case CLUSTER_REWARI:
			 clusterName = CLUSTER_REWARI;
			sendClusterValues(clusterName);
			break;
		case CLUSTER_ROHTAK:
			 clusterName = CLUSTER_ROHTAK;
			sendClusterValues(clusterName);
			break;
		case CLUSTER_MEHAM:
			 clusterName = CLUSTER_MEHAM;
			sendClusterValues(clusterName);
			break;
		case CLUSTER_CHARKHI_DADRI:
			 clusterName = CLUSTER_CHARKHI_DADRI;
			sendClusterValues(clusterName);
		break;
		default:
			System.out.println("CLUSTER IS NOT AVAILABLE");
			System.out.println("YOU HAVE PASSED BELOW CLUSTER :- \n"+cluster);
			break;
		}
	}
	
	public void sendClusterValues(String clusterName)
	{
		util.doSendKeys(USER_NAME , clusterName);
		util.doSendKeys(LocatorValues.PASSWORD, Values.PASSWORD);
		util.doSelect(DROP_DOWN_SELECT, DROPDOWN_VALUE);
		util.doClick(SUBMIT_BUTTON);
		
		util.doClick(COMPLAINTS);
		util.doGetText(TABLE_COMPLAIN);
		util.doClick(LOGOUT);
		
	}
}
