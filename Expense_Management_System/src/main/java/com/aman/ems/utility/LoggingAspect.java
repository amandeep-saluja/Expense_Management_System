package com.aman.ems.utility;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.aman.ems.exception.EmsException;

@Component
@Aspect
public class LoggingAspect {
	@AfterThrowing(pointcut = "execution(* com.infy.ems.repository.*.*(..))", throwing = "exception")
	public void logExceptionFromRepository(EmsException exception) throws EmsException {
		log(exception);
	}
	@AfterThrowing(pointcut = "execution(* com.infy.ems.service.*.*(..))", throwing = "exception")
	public void logExceptionFromService(EmsException exception) throws EmsException {
		if (exception.getMessage().contains("Service")) {
			log(exception);
		}
	}
	private void log(Exception exception) {
		Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.error(exception.getMessage(), exception);
	}
}
