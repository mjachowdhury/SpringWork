package ie.mohammed.services;

import java.util.List;

import ie.mohammed.entities.Job;

public interface JobService {

	Job findJob(int id);

	boolean deleteJob(Job job);

	boolean deleteJob(int id);

	Job findByName(String jobName);

	boolean existsByJobId(int jobId);

	String findJobName(int id);

	List<Job> findJobsWithBidAmount(double bidAmount);

	Job save(Job job);

	List<Job> listInAlphabeticalOrder();

	List<Job> listAllJobs();
	
	public void closeJob(Job job);

	// List<Job> findIsActive(boolean isActive);
}
