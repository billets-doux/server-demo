package com.billetsdoux.serverprovider.service;

import com.billetsdoux.servercommon.dto.ProviderDTO;
import com.billetsdoux.servercommon.service.IProviderService;
import org.apache.dubbo.config.annotation.Service;

import java.util.Arrays;
import java.util.List;
// dubbo提供的server
@Service
public class ProviderServiceImpl implements IProviderService {
    @Override
    public List<ProviderDTO> queryList() {
        ProviderDTO dto1 = new ProviderDTO();
        dto1.setId(1);
        dto1.setName("学生");
        dto1.setNumber(100);

        return Arrays.asList(dto1);
    }
}
