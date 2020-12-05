package com.billetsdoux.servercommon.service;

import com.billetsdoux.servercommon.dto.ProviderDTO;

import java.util.List;

public interface IProviderService {
    List<ProviderDTO> queryList();
}
