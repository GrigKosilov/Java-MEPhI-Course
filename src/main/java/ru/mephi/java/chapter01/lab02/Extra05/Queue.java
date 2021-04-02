package ru.mephi.java.chapter01.lab02.Extra05;

// ���������� � ������ Queue �������������� ������� ���������� �����.
// ������������ ����� add () ��� ����� �������� � ����� ������� � ����� remove () ��� �������� �������� �� ������ �������.
// ����������� �������� ��������� � ���� �������.

import java.util.ArrayList;

public class Queue {

    ArrayList<String> nodes = new ArrayList<>();

    public void add(String data) {
        if (nodes.size() == 0) {
            nodes.add(data);
        } else {
            nodes.add("Buffer");
            for (int i = nodes.size() - 1; i > 0; i--) {
                nodes.set(i, nodes.get(i - 1));
            }
            nodes.set(0, data);
        }
    }

    public String remove() {
        return nodes.remove(nodes.size() - 1);
    }

}
