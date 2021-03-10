package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   // <1>
public class TacoCloudApplication {

  public static void main(String[] args) {
    SpringApplication.run(TacoCloudApplication.class, args); // <2>
  }

  public void soSprint01() {
    int i = 0;
    System.out.println("sprint 01 done");
  }

}
