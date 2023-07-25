package com.tcs.service;

import java.sql.Time;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	private Logger logger = LoggerFactory.getLogger(ReportService.class);

	//@Scheduled(fixedRate = 3000)
	@Scheduled(cron = "0/5 * * * * *")
	public void generaeReport() {
		logger.info("Report generated....."+java.time.LocalTime.now());
	}
}
