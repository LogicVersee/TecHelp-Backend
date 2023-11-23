package com.logicverse.techelp.platform.request.domain.model.entities;
import com.logicverse.techelp.platform.request.domain.model.valueobjects.name;
import com.logicverse.techelp.platform.shared.domain.model.entities.AuditableModel;
import com.logicverse.techelp.platform.request.domain.model.valueobjects.problem;
import com.logicverse.techelp.platform.request.domain.model.valueobjects.specification;
import com.logicverse.techelp.platform.request.domain.model.valueobjects.cellphone;
import com.logicverse.techelp.platform.request.domain.model.valueobjects.day;
import com.logicverse.techelp.platform.request.domain.model.valueobjects.hour;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Entity
public class Request extends AuditableModel {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @Getter
    private  name name;

    @Embedded
    @Getter
    private  cellphone cellphone;

    @Embedded
    @Getter
    private  day day;

    @Embedded
    @Getter
    private  hour hour;

    @Embedded
    @Getter
    private  problem problem;

    @Embedded
    @Getter
    private  specification specification;

    public Request(String name, String cellphone, Date day, String hour, String problem, String specification ){
        this.name=new name(name);
        this.cellphone=new cellphone(cellphone);
        this.day=new day(day);
        this.problem=new problem(problem);
        this.specification=new specification(specification);
    }
    public Request(){}

    public String getName(){return this.name.getName();}
    public String getcellphone(){return this.cellphone.getCellphone();}
    public Date getDay(){return this.day.getDay();}
    public String getproblem(){return this.problem.getProblem();}
    public String getSpecification(){return this.specification.getSpecification();}
}
