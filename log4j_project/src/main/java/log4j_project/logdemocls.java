package log4j_project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logdemocls 
{
  private static final Logger logger = LogManager.getLogger(logdemocls.class);

	    public static void main(String[] args)
	    {
	    	logger.warn("hiiiiii good bye");
	        logger.info("Hello World!");
	        logger.debug("Hello World!");
	    }
	
	
	
}
