/**
 * 
 */
package com.us.cmbms.mymonitor;

import java.util.List;

import com.us.kulm.common.URL;
import com.us.kulm.config.annotation.Service;
import com.us.kulm.monitor.MonitorService;

/**
 * @author Bruce<br>
 * @version 1.0<br>
 * @CreateDate 6 May 2016 <br>
 */
@Service
public class TheMyMonitor implements MonitorService{

	/* (non-Javadoc)
	 * @see com.us.kulm.monitor.MonitorService#collect(com.us.kulm.common.URL)
	 */
	public void collect(URL statistics) {
		System.out.println(statistics);
	}

	/* (non-Javadoc)
	 * @see com.us.kulm.monitor.MonitorService#lookup(com.us.kulm.common.URL)
	 */
	public List<URL> lookup(URL query) {
		// TODO Auto-generated method stub
		return null;
	}
	
}