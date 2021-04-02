package ru.mephi.java.chapter01.lab02.Extra04;

// ���������� � ������ Queue �������������� ������� ���������� �����.
// ������������ ����� add () ��� ����� �������� � ����� ������� � ����� remove () ��� �������� �������� �� ������ �������.
// ����������� �������� ��������� � ���� �������.

import java.util.ArrayList;
import java.util.LinkedList;

public class Queue {
    LinkedList<String> nodes = new LinkedList<>();

    public void add(String data) {
        nodes.add(data);
    }

    public String remove() {
        return nodes.removeFirst();
    }

}
