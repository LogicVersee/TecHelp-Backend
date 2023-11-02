package com.logicverse.techelp.platform.tasking.infrestructure.persistence.jpa.repositories;
import com.logicverse.techelp.platform.monitoring.domain.model.valueobjects.TechnicianId;
import com.logicverse.techelp.platform.tasking.domain.model.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {


    Optional<Task> findByTechnicianId(TechnicianId technicianId);

}
