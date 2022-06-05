package com.techshard.graphql.query;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class TestQueryResolver implements GraphQLQueryResolver {

    public String test(String jsonStr) {
        return "Test Query Resolver !!! : " + jsonStr;
    }
}
