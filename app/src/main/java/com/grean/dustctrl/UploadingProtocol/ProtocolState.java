package com.grean.dustctrl.UploadingProtocol;

/**
 * Created by weifeng on 2018/6/28.
 */

public interface ProtocolState {
    /**
     * 接收处理方法
     * @param buff
     * @param length
     */
    void handleReceiveBuff(byte[] buff,int length);


    /**
     *
     * @param now 当前时间
     * @param lastMinDate 最近一次分钟数据
     * @param lastHourDate 最近一次小时数据
     */
    void uploadSystemTime(long now,long lastMinDate,long lastHourDate);

    /**
     * 上传分钟数据
     * @param date
     */
    void uploadMinDate(long now,long date);

    /**
     * 10s节拍方法
     * @param date
     */
    void uploadSecondDate(long now);

    /**
     *上传小时数据节拍
     * @param date
     */
    void uploadHourDate(long now,long date);

    /**
     * 设置协议因子编码
     * @param format
     */
    void setConfig(UploadingConfigFormat format);
}
