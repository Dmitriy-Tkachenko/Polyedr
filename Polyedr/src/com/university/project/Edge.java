package com.university.project;

/**
 * @author Е.А. Роганов
 * Класс Edge, реализующий ребро полиэдра.
 */
public class Edge{
    /**
     * Начало ребра.
     */
    private Vertex begin;

    /**
     * Конец ребра.
     */
    private Vertex end;

    /**
     * Конструктор.
     * @param begin Начало ребра.
     * @param end Конец ребра.
     */
    public Edge(Vertex begin, Vertex end){
        this.begin = begin;
        this.end = end;
    }

    /**
     * Получить начало ребра.
     * @return Начало ребра.
     */
    public final Vertex getBegin(){
        return begin;
    }

    /**
     * Получить конец ребра.
     * @return Конец ребра.
     */
    public final Vertex getEnd(){
        return end;
    }
}
