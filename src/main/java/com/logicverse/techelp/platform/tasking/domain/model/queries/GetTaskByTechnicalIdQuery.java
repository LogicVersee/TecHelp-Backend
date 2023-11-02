package com.logicverse.techelp.platform.tasking.domain.model.queries;

import com.logicverse.techelp.platform.monitoring.domain.model.valueobjects.TechnicianId;

public record GetTaskByTechnicalIdQuery(TechnicianId technicianId ) {
}
