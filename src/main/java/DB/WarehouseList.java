package DB;

import entity.Warehouse;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

//public class WarehouseList{
//    private static List< Warehouse > warehouseList=new ArrayList<>();
//    public static void addWarehouseList(Warehouse warehouse){
//        warehouseList.add(warehouse);
//        }
//    }
@Getter
@ToString
public class WarehouseList<T extends Warehouse>{
    private  List< T > warehouseList=new ArrayList<>();
    public  void addWarehouseList(T warehouseobject){
        warehouseList.add(warehouseobject);
    }
    public T showWarehouseObject(int index){
        return warehouseList.get(index);
    }

    public List< T > showAllWarehouseObjects(){
        return  warehouseList;
    }
    public boolean updateWarehouseobject(T warehouseobject,int quantity){
        boolean updateResult=false;
        if(warehouseobject.getQuantity()>=quantity){
            warehouseobject.setQuantity(warehouseobject.getQuantity()-quantity);
           updateResult=true;
        }
        return updateResult;
    }

    public T findByCode(Integer code){
        T warehouseObject=null;
        for (T t : warehouseList) {
            if(t.getCode()==code) warehouseObject=t;
        }
        return warehouseObject;
        }
    }


