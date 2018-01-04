package com.dfs.harmony.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "dataset", type = "metadata", shards = 1, replicas = 0, refreshInterval = "-1")
public class DatasetMetadata {

    @Id
    private String id;

//    private String firstName;
//
//    private String lastName;

    private String datasetName;

    public DatasetMetadata() {
    }

//    public DatasetMetadata(String firstName, String lastName, String datasetName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.datasetName = datasetName;
//    }

    public DatasetMetadata(String firstName, String lastName, String datasetName) {
        this.datasetName = datasetName;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDatasetName() {
        return this.datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

//    public String getfirstName() {
//        return this.firstName;
//    }
//
//    public void setfirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getlastName() {
//        return this.lastName;
//    }
//
//    public void setlastName(String lastName) {
//        this.lastName = lastName;
//    }

    @Override
    public String toString() {
        return String.format("Dataset[id=%s, datasetName='%s']", this.id,
                this.datasetName);
    }
}
