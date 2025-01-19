package com.shoddev.ToDoList.Repositories;


import com.shoddev.ToDoList.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task, Long> {

}
