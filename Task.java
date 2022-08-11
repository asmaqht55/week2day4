package com.example.tasksystem;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class Task {
    @RestController
    public class TaksTracker{
        ArrayList<TaksTracker>Task=new ArrayList<>();


        @GetMapping("/task")
        public ArrayList getTask() {
            return Task;
        }


        @PostMapping("/task")
        public String addtask(@RequestBody TaksTracker task) {
            Task.add(task);
            return "New task added !";
        }
        @PutMapping("/task")
        public String updettask(@PathVariable int index,@RequestBody TaksTracker task){
              Task.set(index,task);
              return "The task updetd";
        }
        @DeleteMapping("/task")
        public String delettask(@PathVariable int index){
            Task.remove(index);
            return "The task Deleted !";

        }
         @PutMapping("/task/status")
          public CustmerMessage withdrw(RequestBody TaskTracker task){
            for(int i=0;i< Task.size();i++){
                if(Task.get(i),getID()== task.getId()){
                    if (tasklist.get(i).isStatus()) {
                        return new CustmerMessage("done");
                    } else {
                        return new CustmerMessage("not done");
                    }

                }

            }
             return new CustmerMessage("WRONG  ID");
                }
            }

         }
    }






}




























