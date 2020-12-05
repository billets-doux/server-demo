package com.billetsdoux.servercommon.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class ProviderDTO  implements Serializable {
    private int id;
    private String name;
    private Integer number;
}
