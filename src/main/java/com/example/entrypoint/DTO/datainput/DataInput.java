package com.example.entrypoint.DTO.datainput;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DataInput {

    private String authenticationToken;

    private List<DataSource> dataSources;
}
