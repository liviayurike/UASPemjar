package org.pemjar.socketclient;

public class Item implements Comparable<Item>{
    private String pesan;
    private String data;
    private String path;

    public Item(String n,String d, String p)
    {
        pesan = n;
        data = d;
        path = p;
    }

    public String getPesan() {
        return pesan;
    }

    public String getData()
    {
        return data;
    }
    public String getPath()
    {
        return path;
    }
    public int compareTo(Item o) {
        if(this.pesan != null)
            return this.pesan.toLowerCase().compareTo(o.getPesan().toLowerCase());
        else
            throw new IllegalArgumentException();
    }
}
