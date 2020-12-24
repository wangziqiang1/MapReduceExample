package com.partition;


import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class CustomPartitioner extends Partitioner<Text,PartitionBean> {
    @Override
    public int getPartition(Text text, PartitionBean partitionBean, int i) {
        int partition=0;
        final String appkey = text.toString();
        if(appkey.equals("kar")){
            partition=1;
        }else if(appkey.equals("app")){
            partition=2;
        }else{
            partition=0;
        }
        return partition;
    }
}
