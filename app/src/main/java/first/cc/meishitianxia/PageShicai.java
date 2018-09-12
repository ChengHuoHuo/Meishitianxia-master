package first.cc.meishitianxia;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import adapter.LeftRecyclerAdapter;
import adapter.RightRecyclerAdapter;
import lqy.lqy_LeftRecyclerAdapter;
import lqy.lqy_RightRecyclerAdapter;

/**
 * Created by 44223 on 2018/7/11.
 */

public class PageShicai extends Fragment {


    private RecyclerView leftRecyclerView;
    private RecyclerView rightRecyclerView1;
    private RecyclerView rightRecyclerView2;
    private RecyclerView rightRecyclerView3;
    private RecyclerView.LayoutManager leftLayoutManager;
    private RecyclerView.LayoutManager rightLayoutManager;
    private lqy_LeftRecyclerAdapter leftAdapter;
    private lqy_RightRecyclerAdapter rightAdapter1;
    private lqy_RightRecyclerAdapter rightAdapter2;
    private lqy_RightRecyclerAdapter rightAdapter3;
    private List<String> bigSortList = new ArrayList<String>();
    private List<String> bigSortList0 = new ArrayList<String>();
    private List<String> bigSortList1 = new ArrayList<String>();
    private List<String> bigSortList2 = new ArrayList<String>();
    private List<String> bigSortList3 = new ArrayList<String>();
    private List<String> bigSortList4 = new ArrayList<String>();
    private List<String> bigSortList5 = new ArrayList<String>();
    private List<String> bigSortList6 = new ArrayList<String>();
    private List<String> bigSortList7 = new ArrayList<String>();
    private List<String> bigSortList8 = new ArrayList<String>();
    private List<String> bigSortList9 = new ArrayList<String>();


    //private List<String> smallSortList = new ArrayList<String>();
    private List<String> smallSortList0= new ArrayList<String>();
    private List<String> smallSortList1= new ArrayList<String>();
    private List<String> smallSortList2= new ArrayList<String>();
    private List<String> smallSortList3= new ArrayList<String>();
    private List<String> smallSortList4= new ArrayList<String>();
    private List<String> smallSortList5= new ArrayList<String>();
    private List<String> smallSortList6= new ArrayList<String>();
    private List<String> smallSortList7= new ArrayList<String>();
    private List<String> smallSortList8= new ArrayList<String>();
    private List<String> smallSortList9= new ArrayList<String>();


    View view;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View v = inflater.inflate(R.layout.vp_fenlei, container,false);

         view=v;

        initData();
        initView();

        view=v;

        return v;
    }





    private void initData() {
        int i=0;
        if(i==0) {
            bigSortList0.add("时令与热门");
            bigSortList.add("时令与热门");
            smallSortList0.add("鸡肉");
            smallSortList0.add("鸡翅");
            smallSortList0.add("鸡蛋");
            smallSortList0.add("牛肉");
            smallSortList0.add("猪肉");
            smallSortList0.add("小龙虾");
            smallSortList0.add("皮皮虾");
            smallSortList0.add("螃蟹");
            smallSortList0.add("虾");
            smallSortList0.add("扇贝");
            smallSortList0.add("黄瓜");
            smallSortList0.add("茄子");
            smallSortList0.add("西红柿");
            smallSortList0.add("土豆");
            smallSortList0.add("黑木耳");

            i++;
        }
        if(i==1) {
            bigSortList1.add("肉禽类");
            bigSortList.add("肉禽类");

            smallSortList1.add("猪肉");
            smallSortList1.add("猪腰");
            smallSortList1.add("猪血");
            smallSortList1.add("猪肚");
            smallSortList1.add("猪耳");
            smallSortList1.add("猪脚");
            smallSortList1.add("猪鼻");
            smallSortList1.add("牛肉");
            smallSortList1.add("牛腩");
            smallSortList1.add("牛排");
            smallSortList1.add("牛杂");
            smallSortList1.add("牛心");
            smallSortList1.add("牛尾");
            smallSortList1.add("牛骨");
            smallSortList1.add("羊肉");
            smallSortList1.add("羊脑");
            smallSortList1.add("羊排");
            smallSortList1.add("羊血");
            smallSortList1.add("羊肝");
            smallSortList1.add("羊肺");
            smallSortList1.add("羊肚");
            smallSortList1.add("羊杂");
            smallSortList1.add("羊尾");
            smallSortList1.add("羊臀");
            smallSortList1.add("鸡肉");
            smallSortList1.add("鸡胸");
            smallSortList1.add("鸡杂");
            smallSortList1.add("鸡心");
            smallSortList1.add("鸡腿");
            smallSortList1.add("鸡肝");
            smallSortList1.add("火鸡");
            smallSortList1.add("土鸡");
            smallSortList1.add("鸡胗");
            smallSortList1.add("鸡皮");
            smallSortList1.add("山鸡");
            smallSortList1.add("其他肉类");
            smallSortList1.add("其他禽类");

            i++;
        }
        if(i==2) {
            bigSortList2.add("海鲜");
            bigSortList.add("海鲜");


            smallSortList2.add("草鱼");
            smallSortList2.add("鲤鱼");
            smallSortList2.add("鲫鱼");
            smallSortList2.add("鲈鱼");
            smallSortList2.add("泥鳅");
            smallSortList2.add("银鱼");
            smallSortList2.add("乌鱼");
            smallSortList2.add("胖头鱼");
            smallSortList2.add("罗非鱼");
            smallSortList2.add("土虱鱼");
            smallSortList2.add("带鱼");
            smallSortList2.add("黄鱼");
            smallSortList2.add("鳕鱼");
            smallSortList2.add("金枪鱼");
            smallSortList2.add("秋刀鱼");
            smallSortList2.add("白带鱼");
            smallSortList2.add("石斑鱼");
            smallSortList2.add("对虾");
            smallSortList2.add("龙虾");
            smallSortList2.add("河虾");
            smallSortList2.add("基围虾");
            smallSortList2.add("海米");
            smallSortList2.add("虾皮");
            smallSortList2.add("虾仁");
            smallSortList2.add("虾类滑");
            smallSortList2.add("青龙虾");
            smallSortList2.add("樱花虾");
            smallSortList2.add("蟹肉");
            smallSortList2.add("螃蟹");
            smallSortList2.add("大闸蟹");
            smallSortList2.add("面包蟹");
            smallSortList2.add("石蟹");
            smallSortList2.add("膏蟹");
            smallSortList2.add("大花蟹");
            smallSortList2.add("扇贝");
            smallSortList2.add("蛤蜊");
            smallSortList2.add("牡蛎");
            smallSortList2.add("墨鱼");
            smallSortList2.add("鲍鱼");
            smallSortList2.add("青口贝");
            smallSortList2.add("生蚝");
            smallSortList2.add("其他水产品");

            i++;
        }
        if(i==3) {
            bigSortList3.add("酒水饮料");
            bigSortList.add("酒水饮料");

            smallSortList3.add("红茶");
            smallSortList3.add("绿茶");
            smallSortList3.add("松针茶");
            smallSortList3.add("普洱茶");
            smallSortList3.add("苦丁");
            smallSortList3.add("乌龙茶");
            smallSortList3.add("砖茶");
            smallSortList3.add("咖啡");
            smallSortList3.add("可乐");
            smallSortList3.add("啤酒");
            smallSortList3.add("红酒");
            smallSortList3.add("白酒");
            smallSortList3.add("鸡尾酒");
            smallSortList3.add("葡萄酒");
            smallSortList3.add("花雕酒");

            i++;
        }
        if(i==4) {
            bigSortList4.add("调味品");
            bigSortList.add("调味品");

            smallSortList4.add("八角");
            smallSortList4.add("盐");
            smallSortList4.add("淀粉");
            smallSortList4.add("腐乳");
            smallSortList4.add("胡椒粉");
            smallSortList4.add("丁香");
            smallSortList4.add("可可粉");
            smallSortList4.add("虾酱");
            smallSortList4.add("糖浆");
            smallSortList4.add("牛肉酱");
            smallSortList4.add("柠檬草");
            smallSortList4.add("甜面酱");
            smallSortList4.add("意面酱");
            smallSortList4.add("香草");
            smallSortList4.add("迷迭香");
            smallSortList4.add("沙拉酱");
            smallSortList4.add("白醋");
            smallSortList4.add("酱油");
            smallSortList4.add("粗盐");
            smallSortList4.add("芥末酱");
            smallSortList4.add("豆瓣");
            smallSortList4.add("豆豉");
            smallSortList4.add("豆瓣酱");
            smallSortList4.add("番茄沙司");
            smallSortList4.add("番茄酱");
            smallSortList4.add("山茶油");
            smallSortList4.add("油茶籽油");
            smallSortList4.add("杏仁油");
            smallSortList4.add("稻米油");
            smallSortList4.add("葵花籽油");
            smallSortList4.add("亚麻籽油");
            smallSortList4.add("耗油");
            smallSortList4.add("色拉油");
            smallSortList4.add("花生油");
            smallSortList4.add("芝麻油");
            smallSortList4.add("牛油");
            smallSortList4.add("鱼露");
            smallSortList4.add("玉米油");
            smallSortList4.add("橄榄油");
            smallSortList4.add("蒜蓉酱");
            smallSortList4.add("辣椒油");
            smallSortList4.add("肉桂");
            smallSortList4.add("干姜");
            smallSortList4.add("生抽");
            smallSortList4.add("植物油");
            smallSortList4.add("黑胡椒");

            i++;
        }
        if(i==5) {
            bigSortList5.add("鲜果");
            bigSortList.add("鲜果");

            smallSortList5.add("苹果");
            smallSortList5.add("香蕉");
            smallSortList5.add("草莓");
            smallSortList5.add("柠檬");
            smallSortList5.add("菠萝");
            smallSortList5.add("芒果");
            smallSortList5.add("石榴");
            smallSortList5.add("荔枝");
            smallSortList5.add("猕猴桃");
            smallSortList5.add("西瓜");
            smallSortList5.add("葡萄");
            smallSortList5.add("椰子");
            smallSortList5.add("火龙果");
            smallSortList5.add("黄桃");
            smallSortList5.add("梨子");
            smallSortList5.add("杏");
            smallSortList5.add("柚子");
            smallSortList5.add("黄桃");
            smallSortList5.add("罗汉果");
            smallSortList5.add("牛油果");
            smallSortList5.add("橙子");
            smallSortList5.add("橘子");
            smallSortList5.add("百香果");
            smallSortList5.add("黑加仑");
            smallSortList5.add("榴莲");
            smallSortList5.add("杨桃");
            smallSortList5.add("香瓜");
            smallSortList5.add("桑葚");
            smallSortList5.add("哈密瓜");
            smallSortList5.add("蓝莓");
            smallSortList5.add("芭乐");
            smallSortList5.add("龙眼");
            smallSortList5.add("枇杷");
            smallSortList5.add("黑橄榄");
            smallSortList5.add("奇异果");

            i++;
        }
        if(i==6) {
            bigSortList6.add("干果");
            bigSortList.add("干果");

            smallSortList6.add("栗子");
            smallSortList6.add("花生");
            smallSortList6.add("芝麻");
            smallSortList6.add("枸杞");
            smallSortList6.add("葡萄干");
            smallSortList6.add("核桃");
            smallSortList6.add("蔓越莓");
            smallSortList6.add("杏仁");
            smallSortList6.add("大枣");
            smallSortList6.add("莲子");
            smallSortList6.add("巴旦木");
            smallSortList6.add("莲蓉");
            smallSortList6.add("橡实");
            smallSortList6.add("果脯");
            smallSortList6.add("小胡桃");
            smallSortList6.add("山楂干");
            smallSortList6.add("红枣");
            smallSortList6.add("话梅");
            smallSortList6.add("毛核桃");
            smallSortList6.add("白芝麻");
            smallSortList6.add("北杏仁");
            smallSortList6.add("南杏仁");
            smallSortList6.add("核桃片");
            smallSortList6.add("黑枣");
            smallSortList6.add("菠萝蜜子");
            smallSortList6.add("榛子");
            smallSortList6.add("瓜子仁");
            smallSortList6.add("麦芽");
            smallSortList6.add("桂圆");
            smallSortList6.add("酸枣仁");
            smallSortList6.add("西瓜子");
            smallSortList6.add("开心果");

            i++;
        }
        if(i==7) {
            bigSortList.add("豆类及豆制品");
            bigSortList7.add("豆类及豆制品");

            smallSortList7.add("红豆");
            smallSortList7.add("黑豆");
            smallSortList7.add("绿豆");
            smallSortList7.add("青豆");
            smallSortList7.add("黄豆");
            smallSortList7.add("白豆");
            smallSortList7.add("红芸豆");
            smallSortList7.add("红腰豆");
            smallSortList7.add("白扁豆");
            smallSortList7.add("赤小豆");
            smallSortList7.add("小圆豆");
            smallSortList7.add("鹰嘴豆");
            smallSortList7.add("蜜豆");
            smallSortList7.add("眉豆");
            smallSortList7.add("嫩豆腐");
            smallSortList7.add("米豆腐");
            smallSortList7.add("油豆腐");
            smallSortList7.add("冻豆腐");
            smallSortList7.add("日本豆腐");
            smallSortList7.add("豆腐干");
            smallSortList7.add("千张");
            smallSortList7.add("豆腐皮");
            smallSortList7.add("豆泡");
            smallSortList7.add("豆腐脑");
            smallSortList7.add("香干");
            smallSortList7.add("豆浆");
            smallSortList7.add("腐竹");
            smallSortList7.add("豆渣");
            smallSortList7.add("南豆腐");
            smallSortList7.add("板豆腐");
            smallSortList7.add("千页豆腐");
            smallSortList7.add("绢豆腐");
            smallSortList7.add("豆筋");
            smallSortList7.add("素鸡");
            smallSortList7.add("芸豆");
            smallSortList7.add("百叶结");
            smallSortList7.add("熏干");
            smallSortList7.add("百页");
            smallSortList7.add("豆粕");

            i++;
        }

        if(i==8) {
            bigSortList.add("药食及其他");
            bigSortList8.add("药食及其他");
            smallSortList8.add("人参");
            smallSortList8.add("党参");
            smallSortList8.add("阿胶");
            smallSortList8.add("茯苓");
            smallSortList8.add("当归");
            smallSortList8.add("蜂王浆");
            smallSortList8.add("百合干");
            smallSortList8.add("苦豆子");
            smallSortList8.add("马鞭草");
            smallSortList8.add("鸡骨草");
            smallSortList8.add("甘草");
            smallSortList8.add("川贝");
            smallSortList8.add("杜仲");
            smallSortList8.add("土三七");
            smallSortList8.add("天麻");
            smallSortList8.add("鸭舌草");
            smallSortList8.add("益母草");
            smallSortList8.add("牛黄");
            smallSortList8.add("淡竹叶");
            smallSortList8.add("郁金");
            smallSortList8.add("女贞子");
            smallSortList8.add("破布子");
            smallSortList8.add("丹参");
            smallSortList8.add("南沙参");
            smallSortList8.add("雪莲花");
            smallSortList8.add("白附子");
            smallSortList8.add("黄芪");
            smallSortList8.add("麻黄");
            smallSortList8.add("狗尾草");
            smallSortList8.add("芭蕉叶");
            smallSortList8.add("桔梗");
            smallSortList8.add("决明子");
            smallSortList8.add("白芷");
            smallSortList8.add("鼠尾草");
            smallSortList8.add("白玉草");
            smallSortList8.add("南板蓝叶");



            i++;
        }


    }

    private void initView() {
        leftRecyclerView = (RecyclerView) view.findViewById(R.id.rv_sort_left) ;
        rightRecyclerView1= (RecyclerView) view.findViewById(R.id.rv_sort_right);
        rightRecyclerView2= (RecyclerView) view.findViewById(R.id.rv_sort_right);
        rightRecyclerView3= (RecyclerView) view.findViewById(R.id.rv_sort_right);



        leftLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        leftRecyclerView.setLayoutManager(leftLayoutManager);



        leftAdapter = new lqy_LeftRecyclerAdapter(this, bigSortList, leftRecyclerView);
        //左侧列表的点击事件

        leftAdapter.setItemClickListener(new lqy_LeftRecyclerAdapter.LeftListener() {
            @Override
            public void onItemClick(int position) {
                //向适配器中返回点击的位置，在适配器中进行操作
                leftAdapter.getSelectedPosition(position);
                // rightAdapter.getSelectedPosition(position);
                if(position==0) { rightAdapter1 = new lqy_RightRecyclerAdapter(getActivity(), bigSortList0,smallSortList0, rightRecyclerView1);
                    rightRecyclerView1.setAdapter(rightAdapter1);
                    rightRecyclerView1.setLayoutManager(rightLayoutManager);
                }
                if(position==1){ rightAdapter1 = new lqy_RightRecyclerAdapter(getActivity(), bigSortList1,smallSortList1, rightRecyclerView1);
                    rightRecyclerView1.setAdapter(rightAdapter1);
                    rightRecyclerView1.setLayoutManager(rightLayoutManager);

                }
                else if(position==2) {rightAdapter2 = new lqy_RightRecyclerAdapter(getActivity(), bigSortList2,smallSortList2, rightRecyclerView2);
                    rightRecyclerView2.setAdapter(rightAdapter2);
                    rightRecyclerView2.setLayoutManager(rightLayoutManager);
                }
                else if(position==3) {rightAdapter3 = new lqy_RightRecyclerAdapter(getActivity(), bigSortList3,smallSortList3, rightRecyclerView3);
                    rightRecyclerView3.setAdapter(rightAdapter3);
                    rightRecyclerView3.setLayoutManager(rightLayoutManager);
                }
                //                rightLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
                //                rightRecyclerView.setLayoutManager(rightLayoutManager);
                else if(position==4) {rightAdapter3 = new lqy_RightRecyclerAdapter(getActivity(), bigSortList4,smallSortList4, rightRecyclerView3);
                    rightRecyclerView3.setAdapter(rightAdapter3);
                    rightRecyclerView3.setLayoutManager(rightLayoutManager);
                }
                else if(position==5) {rightAdapter3 = new lqy_RightRecyclerAdapter(getActivity(), bigSortList5,smallSortList5, rightRecyclerView3);
                    rightRecyclerView3.setAdapter(rightAdapter3);
                    rightRecyclerView3.setLayoutManager(rightLayoutManager);
                }
                else if(position==6) {rightAdapter3 = new lqy_RightRecyclerAdapter(getActivity(), bigSortList6,smallSortList6, rightRecyclerView3);
                    rightRecyclerView3.setAdapter(rightAdapter3);
                    rightRecyclerView3.setLayoutManager(rightLayoutManager);
                }
                else if(position==7) {rightAdapter3 = new lqy_RightRecyclerAdapter(getActivity(), bigSortList7,smallSortList7, rightRecyclerView3);
                    rightRecyclerView3.setAdapter(rightAdapter3);
                    rightRecyclerView3.setLayoutManager(rightLayoutManager);
                }
                else if(position==8) {rightAdapter3 = new lqy_RightRecyclerAdapter(getActivity(), bigSortList8,smallSortList8, rightRecyclerView3);
                    rightRecyclerView3.setAdapter(rightAdapter3);
                    rightRecyclerView3.setLayoutManager(rightLayoutManager);
                }







            }
        });
        //        rightAdapter1 = new RightRecyclerAdapter(getApplicationContext(), bigSortList,smallSortList1, rightRecyclerView);
        //        rightAdapter2 = new RightRecyclerAdapter(getApplicationContext(), bigSortList,smallSortList1, rightRecyclerView);
        //        rightAdapter3 = new RightRecyclerAdapter(getApplicationContext(), bigSortList,smallSortList1, rightRecyclerView);
        leftRecyclerView.setAdapter(leftAdapter);
        //        leftAdapter.setItemClickListener(new LeftRecyclerAdapter.LeftListener() {
        //                                             @Override
        //                                             public void onItemClick(int position) {
        ////                                                 if(position==0) rightAdapter = new RightRecyclerAdapter(getApplicationContext(), bigSortList,smallSortList0, rightRecyclerView);
        //                                                 if(position==1) rightAdapter = new RightRecyclerAdapter(getApplicationContext(), bigSortList,smallSortList1, rightRecyclerView);
        //                                                 if(position==2) rightAdapter = new RightRecyclerAdapter(getApplicationContext(), bigSortList,smallSortList2, rightRecyclerView);
        //                                                 if(position==3) rightAdapter = new RightRecyclerAdapter(getApplicationContext(), bigSortList,smallSortList3, rightRecyclerView);
        //                                                 if(position==4) rightAdapter = new RightRecyclerAdapter(getApplicationContext(), bigSortList,smallSortList4, rightRecyclerView);
        //                                             }
        //                                         });

        //
        rightLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        //        rightRecyclerView1.setLayoutManager(rightLayoutManager);
        //        rightRecyclerView2.setLayoutManager(rightLayoutManager);
        //        rightRecyclerView3.setLayoutManager(rightLayoutManager);

        //右侧列表的点击事件
        //        rightAdapter.setItemClickListener(new RightRecyclerAdapter.RightListener() {
        //            @Override
        //            public void onItemClick(int position) {
        //                Toast.makeText(lqy_MainActivity.this,bigSortList.get(position),Toast.LENGTH_SHORT).show();
        //
        ////
        //
        //            }
        //        });
        ////        //右侧列表的滚动事件
        //        rightRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
        //            @Override
        //            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        //                super.onScrolled(recyclerView, dx, dy);
        //                //获取右侧列表的第一个可见Item的position
        //                int TopPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
        //                //左侧得到这个position
        //                leftAdapter.getSelectedPosition(TopPosition);
        //               // int nowposition=((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition();
        //
        //            }
        //
        //        });
        // int positionn=(int)textview.getTag();

        //        rightRecyclerView.setAdapter(rightAdapter1);



    }
}