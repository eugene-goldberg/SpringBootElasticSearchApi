package com.dfs.harmony.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/datasetsearchapi")
public class DatasetMetadataRestApiController {
    @Autowired
    private DatasetRepository repository;

    @RequestMapping(value = "/metadata/", method = RequestMethod.GET)
    private ResponseEntity<List<DatasetMetadata>> fetchAll() {
        System.out.println("Dataset Metadata found with findAll():");
        System.out.println("-------------------------------");
        List<DatasetMetadata> metadataList = new ArrayList<>();
        for (DatasetMetadata metadata : this.repository.findAll()) {
            System.out.println(metadata);
            metadataList.add(metadata);
        }
        System.out.println();

        return new ResponseEntity<List<DatasetMetadata>>(metadataList, HttpStatus.OK);
    }
}
