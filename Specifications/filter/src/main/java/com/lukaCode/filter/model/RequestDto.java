package com.lukaCode.filter.model;

import jakarta.websocket.server.ServerEndpoint;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RequestDto {
    private List<SearchRequestDto> searchRequestDto;
    private GlobalOperator globalOperator;

    public enum GlobalOperator{
        AND, OR
    }
}
