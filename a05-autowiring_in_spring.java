package com.telusko.app;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public void compile(){
        System.out.println("compiling");
    }
}

// ========================

package com.telusko.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Autowired
    Laptop laptop;
    public  void code() {
       laptop.compile();
        System.out.println("Coding");
    }
  }


// ======================
package com.telusko.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

    public static void main(String[] args) {

       ApplicationContext context= SpringApplication.run(SpringBootFirstApplication.class, args);
        Alien obj;
        obj=context.getBean(Alien.class);
        obj.code();
    }

}
