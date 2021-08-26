package com.mis.survey.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.survey.domain.DemographicVO;

@Repository
public class ResultDAOImpl implements ResultDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "com.mis.mapper.ResultMapper";

	// 1. 설문 결과 - BigFive
	@Override
	public int[] readBigFive(String sessionId) throws Exception {
		int bigfive[] = new int[5];
		Map<String, Integer> rs = new HashMap<>();

		rs = session.selectOne(namespace + ".readBigFive", sessionId);
		
		for (int i = 0; i <= 4; i++) {
			
			if (rs.get("B" + (i + 1)) != null) {
				bigfive[i] = Integer.parseInt(String.valueOf(rs.get("B" + (i + 1))));
			}
		}

		return bigfive;
	}

	// 2. 설문 결과 - Career
	@Override
	public int[] readCareer(String sessionId) throws Exception {
		int carreer[] = new int[11];
		Map<String, Integer> rs = new HashMap<>();

		rs = session.selectOne(namespace + ".readCareer", sessionId);
		
		for (int i = 0; i <= 10; i++) {
			if (rs.get("C" + (i + 1)) != null) {
				carreer[i] = Integer.parseInt(String.valueOf(rs.get("C" + (i + 1))));
			}
		}
		return carreer;
	}

	// 3. 설문 결과 - Job
	@Override
	public int[] readJob(String sessionId) throws Exception {
		int job[] = new int[7];
		Map<String, Integer> rs = new HashMap<>();
		
		rs = session.selectOne(namespace + ".readJob", sessionId);
		
		for (int i = 0; i <= 6; i++) {
			if (rs.get("J" + (i + 1)) != null) {
				job[i] = Integer.parseInt(String.valueOf(rs.get("J" + (i + 1))));
			}
		}
		return job;
	}

	// 4. 설문 결과 - Demographic
	@Override
	public DemographicVO readDemographic(String sessionId) throws Exception {
		return session.selectOne(namespace + ".readDemographic", sessionId);
	}

	// 6. 설문 결과 - JobMPS
	@Override
	public String readJobMPS(String sessionId) throws Exception {
		return session.selectOne(namespace + ".readJobMPS", sessionId);
	}

}
