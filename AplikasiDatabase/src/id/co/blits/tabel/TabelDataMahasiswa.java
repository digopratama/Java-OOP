/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.tabel;

/**
 *
 * @author Digo Pratama <pratamawocky@gmail.com>
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelDataMahasiswa extends AbstractTableModel{
private List<DataMahasiswa> list = new ArrayList<DataMahasiswa>();

@Override
public int getRowCount() {
return list.size();
}

@Override
public int getColumnCount() {
return 3;
}

@Override
public Object getValueAt(int rowIndex, int columnIndex) {
switch(columnIndex){
case 0 : return list.get(rowIndex).getNPM();
case 1 : return list.get(rowIndex).getNama();
case 2 : return list.get(rowIndex).getJurusan();
default : return null;
}
}

@Override
public String getColumnName(int kolom){
switch(kolom){
case 0 : return "NPM";
case 1 : return "Nama";
case 2 : return "Jurusan";
default : return null;
}
}

public void add(DataMahasiswa mahasiswa){
list.add(mahasiswa);
fireTableRowsInserted(getRowCount(), getColumnCount());
}

public void delete(int i, int baris){
list.remove(i);
fireTableRowsDeleted(i, baris);
}

public DataMahasiswa get(int baris){
return (DataMahasiswa) list.get(baris);
}
} 
