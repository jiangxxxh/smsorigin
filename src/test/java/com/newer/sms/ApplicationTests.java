package com.newer.sms;

import com.newer.sms.domain.NewerWorker;
import com.newer.sms.service.NewerWorkerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

  @Autowired
  private PasswordEncoder passwordEncoder;

  @Autowired
  private NewerWorkerService newerWorkerService;

  @Test
  public void getPassword() {
    System.out.println(passwordEncoder.encode("newer666"));
  }

  @Test
  public void find(){
    Integer jid = 2;
    List<NewerWorker> workers = newerWorkerService.findAll(jid);
    for(NewerWorker newerWorker:workers){
      System.out.println(newerWorker.getWorkerName()+" "+newerWorker.getNewerJob().getJname());
    }
  }
}
