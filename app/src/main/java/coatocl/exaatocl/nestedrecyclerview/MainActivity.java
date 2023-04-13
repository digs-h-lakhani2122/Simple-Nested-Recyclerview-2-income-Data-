package coatocl.exaatocl.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    RecyclerView recyclerIncome;
    LinearLayoutManager linearLayoutManager2;
    ParentAdapter parentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        recyclerIncome = findViewById(R.id.recyclerIncome);

        linearLayoutManager2 = new LinearLayoutManager(MainActivity.this);

        parentAdapter = new ParentAdapter(parentList());

        recyclerIncome.setAdapter(parentAdapter);
        recyclerIncome.setLayoutManager(linearLayoutManager2);

    }

    private List<Parent> parentList()
    {
        List<Parent> itemList = new ArrayList<>();

        Parent item = new Parent("26","sat","2023","2000$","10$", ChildItemList());
        itemList.add(item);

        Parent item2 = new Parent("27","sun","2023","200$","0$", ChildItemList());
        itemList.add(item2);

        Parent item3 = new Parent("28","mon","2023","20000$","100$", ChildItemList());
        itemList.add(item3);

        Parent item4 = new Parent("29","tue","2023","200$","0$", ChildItemList());
        itemList.add(item4);

        Parent item5 = new Parent("30","wed","2023","200$","10$", ChildItemList());
        itemList.add(item5);

        Parent item6 = new Parent("31","thu","2023","9000$","190$", ChildItemList());
        itemList.add(item6);

        Parent item7 = new Parent("32","fri","2023","2000$","10$", ChildItemList());
        itemList.add(item7);

        return itemList;
    }

    private List<Child> ChildItemList()
    {
        List<Child> ChildItemList = new ArrayList<>();

        ChildItemList.add(new Child("social","check","cash","2000$"));
        ChildItemList.add(new Child("social2","check2","cash2","0$"));
        ChildItemList.add(new Child("social","check","cash","2000$"));
        ChildItemList.add(new Child("social","check","cash","2000$"));
        ChildItemList.add(new Child("social","check","cash","2000$"));
        ChildItemList.add(new Child("social","check","cash","2000$"));
        ChildItemList.add(new Child("social","check","cash","2000$"));
        ChildItemList.add(new Child("social","check","cash","2000$"));

        return ChildItemList;
    }
}
