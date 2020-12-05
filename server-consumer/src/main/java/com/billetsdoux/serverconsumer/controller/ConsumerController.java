package com.billetsdoux.serverconsumer.controller;

import com.billetsdoux.servercommon.dto.ProviderDTO;
import com.billetsdoux.servercommon.service.IProviderService;
import com.billetsdoux.servercommon.vo.ResultVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerController {
    @Reference
    private IProviderService providerService;

    @GetMapping("/list")
    public ResultVO getList(){
        List<ProviderDTO> providerDTOList = providerService.queryList();
        return new ResultVO.Builder<>().code(200).message("success").data(providerDTOList).build();
    }
}
