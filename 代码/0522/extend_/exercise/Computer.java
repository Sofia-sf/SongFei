package com.sfedu.extend_.exercise;

/*
 * @ Date: 20:45 2021/5/22
 * @ Description:
 *
 */
class Computer{
    private String cpu;
    private int memory;
    private int disk;

    public String getDetails(){
        return "该Computer对象的信息为：cpu=" + cpu + " 内存大小为" + memory + "G 硬盘大小为" + disk;
    }

    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}
