package uk.ac.belfastmet.railways.domain;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class StationJsonResponse {
	
	@JsonProperty("Stationboard")
	private StationBoard stationBoard;
}
