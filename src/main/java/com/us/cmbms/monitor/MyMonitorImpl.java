/**
 * 
 */
package com.us.cmbms.monitor;

import java.util.Calendar;

import com.us.kulm.config.annotation.Service;

/**
 * @author Bruce<br>
 * @version 1.0<br>
 * @CreateDate 6 May 2016 <br>
 */
@Service
public class MyMonitorImpl implements MyMonitor{

	/* (non-Javadoc)
	 * @see com.us.cmbms.monitor.MyMonitor#getData(java.lang.String)
	 */
	public String getDate(String str) {
		return "data:"+Calendar.getInstance().toString();
	}

}
