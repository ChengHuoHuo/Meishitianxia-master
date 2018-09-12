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

/**
 * Created by 44223 on 2018/7/11.
 */

public class
PageFenlei extends Fragment {

    private RecyclerView leftRecyclerView;
    private RecyclerView rightRecyclerView1;
    private RecyclerView rightRecyclerView2;
    private RecyclerView rightRecyclerView3;
    private RecyclerView.LayoutManager leftLayoutManager;
    private RecyclerView.LayoutManager rightLayoutManager;
    private LeftRecyclerAdapter leftAdapter;
    private RightRecyclerAdapter rightAdapter1;
    private RightRecyclerAdapter rightAdapter2;
    private RightRecyclerAdapter rightAdapter3;

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
    private List<String> bigSortList10 = new ArrayList<String>();
    private List<String> bigSortList11 = new ArrayList<String>();
    private List<String> bigSortList12 = new ArrayList<String>();
    private List<String> bigSortList13 = new ArrayList<String>();
    private List<String> bigSortList14 = new ArrayList<String>();


    private List<String> smallSortList0 = new ArrayList<String>();
    private List<String> smallSortList1 = new ArrayList<String>();
    private List<String> smallSortList2 = new ArrayList<String>();
    private List<String> smallSortList3 = new ArrayList<String>();
    private List<String> smallSortList4 = new ArrayList<String>();
    private List<String> smallSortList5 = new ArrayList<String>();
    private List<String> smallSortList6 = new ArrayList<String>();
    private List<String> smallSortList7 = new ArrayList<String>();
    private List<String> smallSortList8 = new ArrayList<String>();
    private List<String> smallSortList9 = new ArrayList<String>();
    private List<String> smallSortList10 = new ArrayList<String>();
    private List<String> smallSortList11 = new ArrayList<String>();
    private List<String> smallSortList12 = new ArrayList<String>();
    private List<String> smallSortList13 = new ArrayList<String>();
    private List<String> smallSortList14 = new ArrayList<String>();
    View view;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View v = inflater.inflate(R.layout.vp_fenlei, container, false);
        view=v;

        initData();
        initView();

  return v;
    }




    private void initData() {
        //   for (int i = 0; i < 30;i++) {
        //        bigSortList.add("大分类"+i);
        //  }


        int i=0;
        while(i<15)
        {
            if(i==0)
            {
                bigSortList0.add("推荐");
                bigSortList.add("推荐");

                smallSortList0.add("最新发布");
                smallSortList0.add("一周热门");
                smallSortList0.add("最受欢迎");
                smallSortList0.add("人气菜肴");
                smallSortList0.add("明星菜肴");
                smallSortList0.add("达人榜");
                smallSortList0.add("视频菜谱");
                smallSortList0.add("烘培");
                smallSortList0.add("亲子");
                smallSortList0.add("早餐");
                smallSortList0.add("瘦身");
                smallSortList0.add("快手菜");
                smallSortList0.add("冬季食谱");
                smallSortList0.add("高颜值");
                smallSortList0.add("小清新");




            }
            else if(i==1)
            {
                bigSortList1.add("常见菜式");
                bigSortList.add("常见菜式");

                smallSortList1.add("热菜");
                smallSortList1.add("凉菜");
                smallSortList1.add("汤类");
                smallSortList1.add("主食");
                smallSortList1.add("小吃");
                smallSortList1.add("自制食材");
                smallSortList1.add("泡酱腌制");
                smallSortList1.add("创意菜");
                smallSortList1.add("懒人食谱");
                smallSortList1.add("饮品");
                smallSortList1.add("羹类");
                smallSortList1.add("火锅");
                smallSortList1.add("西餐");
                smallSortList1.add("家常菜");
                smallSortList1.add("糕点");
                smallSortList1.add("烘培");
                smallSortList1.add("技巧类");
                smallSortList1.add("养生菜");
                smallSortList1.add("传统美食");
                smallSortList1.add("零食");
                smallSortList1.add("海鲜");
                smallSortList1.add("宴客菜");
                smallSortList1.add("烤箱菜");
                smallSortList1.add("烧烤");
                smallSortList1.add("下饭菜");
                smallSortList1.add("小菜");
                smallSortList1.add("高档");
                smallSortList1.add("自制酱料");





            }
            else if(i==2)
            {
                bigSortList2.add("场景与饮食方式");
                bigSortList.add("场景与饮食方式");

                smallSortList2.add("中式宴请");
                smallSortList2.add("西式宴请");
                smallSortList2.add("高颜值");
                smallSortList2.add("小清新");
                smallSortList2.add("宿舍时代");
                smallSortList2.add("快手菜");
                smallSortList2.add("二人世界");
                smallSortList2.add("私房菜");
                smallSortList2.add("冬季食谱");
                smallSortList2.add("早餐");
                smallSortList2.add("下午茶");
                smallSortList2.add("宵夜");
                smallSortList2.add("野餐");
                smallSortList2.add("BBQ");
                smallSortList2.add("开胃菜");
                smallSortList2.add("素食");
                smallSortList2.add("朋友聚餐");
                smallSortList2.add("清真菜");
                smallSortList2.add("朋友聚餐");
                smallSortList2.add("清真菜");
                smallSortList2.add("贴秋膘");
                smallSortList2.add("素菜");
                smallSortList2.add("春季食谱");
                smallSortList2.add("夏季食谱");
                smallSortList2.add("秋季食谱");
                smallSortList2.add("婚宴");
                smallSortList2.add("快餐");
                smallSortList2.add("午餐");
                smallSortList2.add("晚餐");
                smallSortList2.add("早午餐");
                smallSortList2.add("酒席");
                smallSortList2.add("烛光晚餐");
                smallSortList2.add("工作餐");
                smallSortList2.add("春节");
                smallSortList2.add("元旦");
                smallSortList2.add("小年");
                smallSortList2.add("上元节");
                smallSortList2.add("中元节");
                smallSortList2.add("下元节");
                smallSortList2.add("教师节");
                smallSortList2.add("妇女节");
                smallSortList2.add("名菜");







            }
            else if(i==3)
            {
                bigSortList3.add("适宜人群");
                bigSortList.add("适宜人群");

                smallSortList3.add("幼儿");
                smallSortList3.add("儿童");
                smallSortList3.add("孕妇");
                smallSortList3.add("产妇");
                smallSortList3.add("婴儿");
                smallSortList3.add("哺乳期");
                smallSortList3.add("学生");
                smallSortList3.add("青少年");
                smallSortList3.add("老人");




            }
            else if(i==4)
            {
                bigSortList4.add("甜品饮品");
                bigSortList.add("甜品饮品");

                smallSortList4.add("甜品");
                smallSortList4.add("糖水");
                smallSortList4.add("咖啡");
                smallSortList4.add("果酱");
                smallSortList4.add("豆浆");
                smallSortList4.add("冰品");
                smallSortList4.add("果汁");
                smallSortList4.add("布丁");
                smallSortList4.add("果冻");
                smallSortList4.add("酸奶");
                smallSortList4.add("鸡尾酒");
                smallSortList4.add("奶昔");
                smallSortList4.add("冰淇凌");








            }
            else if(i==5)
            {
                bigSortList5.add("主食小吃");
                bigSortList.add("主食小吃");

                smallSortList6.add("饺子");
                smallSortList5.add("面条");
                smallSortList5.add("炒饭");
                smallSortList5.add("面食");
                smallSortList5.add("饼");
                smallSortList5.add("粥");
                smallSortList5.add("包子");
                smallSortList5.add("馒头花卷");
                smallSortList5.add("混沌");
                smallSortList5.add("五谷杂粮");
                smallSortList5.add("米饭");
                smallSortList5.add("北京小吃");
                smallSortList5.add("陕西小吃");
                smallSortList5.add("广东小吃");
                smallSortList5.add("四川小吃");
                smallSortList5.add("重庆小吃");
                smallSortList5.add("天津小吃");
                smallSortList5.add("上海小吃");
                smallSortList5.add("福建小吃");
                smallSortList5.add("湖南小吃");
                smallSortList5.add("湖北小吃");
                smallSortList5.add("江西小吃");
                smallSortList5.add("山东小吃");
                smallSortList5.add("山西小吃");
                smallSortList5.add("河南小吃");
                smallSortList5.add("台湾小吃");
                smallSortList5.add("江浙小吃");
                smallSortList5.add("云贵小吃");


            }
            else if(i==6)
            {
                bigSortList6.add("中系菜式");
                bigSortList.add("中系菜式");

                smallSortList6.add("鲁菜");
                smallSortList6.add("鳄菜");
                smallSortList6.add("川菜");
                smallSortList6.add("闽菜");
                smallSortList6.add("苏菜");
                smallSortList6.add("浙菜");
                smallSortList6.add("湘菜");
                smallSortList6.add("徽菜");
                smallSortList6.add("云南菜");
                smallSortList6.add("北京菜");
                smallSortList6.add("上海菜");
                smallSortList6.add("豫菜");
                smallSortList6.add("潮汕菜");
                smallSortList6.add("本帮菜");
                smallSortList6.add("东北菜");




            }
            else if(i==7)
            {
                bigSortList7.add("外国美食");
                bigSortList.add("外国美食");

                smallSortList7.add("日本料理");
                smallSortList7.add("韩国料理");
                smallSortList7.add("法国菜");
                smallSortList7.add("意大利菜");
                smallSortList7.add("西班牙菜");
                smallSortList7.add("泰国菜");
                smallSortList7.add("东南亚");
                smallSortList7.add("越南菜");
                smallSortList7.add("墨西哥菜");
                smallSortList7.add("英国菜");
                smallSortList7.add("印度菜");
                smallSortList7.add("焗饭");
                smallSortList7.add("意大利面");
                smallSortList7.add("咖喱菜");
                smallSortList7.add("寿司");
                smallSortList7.add("沙拉");



            }
            else if(i==8)
            {
                bigSortList8.add("节日节气");
                bigSortList.add("节日节气");

                smallSortList8.add("圣诞节");
                smallSortList8.add("腊八");
                smallSortList8.add("年夜饭");
                smallSortList8.add("母亲节");
                smallSortList8.add("父亲节");
                smallSortList8.add("儿童节");
                smallSortList8.add("端午节");
                smallSortList8.add("中秋");
                smallSortList8.add("元宵节");
                smallSortList8.add("二月二");
                smallSortList8.add("七夕");
                smallSortList8.add("重阳节");
                smallSortList8.add("感恩节");
                smallSortList8.add("万圣节");
                smallSortList8.add("情人节");
                smallSortList8.add("复活节");
                smallSortList8.add("立春");
                smallSortList8.add("雨水");
                smallSortList8.add("谷雨");
                smallSortList8.add("立夏");
                smallSortList8.add("小满");
                smallSortList8.add("芒种");
                smallSortList8.add("夏至");
                smallSortList8.add("立秋");







            }
            else if(i==9)
            {

                bigSortList9.add("甜点");
                bigSortList.add("甜点");


                smallSortList9.add("蛋糕");
                smallSortList9.add("面包");
                smallSortList9.add("饼干");
                smallSortList9.add("吐司");
                smallSortList9.add("戚风蛋糕");
                smallSortList9.add("纸杯蛋糕");
                smallSortList9.add("蛋糕卷");
                smallSortList9.add("玛芬");
                smallSortList9.add("乳酪蛋糕");
                smallSortList9.add("芝士蛋糕");
                smallSortList9.add("奶油蛋糕");
                smallSortList9.add("披萨");
                smallSortList9.add("慕斯");
                smallSortList9.add("曲奇");
                smallSortList9.add("翻糖");





            }
            else if(i==10)
            {
                bigSortList10.add("健康食谱");
                bigSortList.add("健康食谱");

                smallSortList10.add("减肥瘦身");
                smallSortList10.add("贫血");
                smallSortList10.add("痛经");
                smallSortList10.add("清热怯火");
                smallSortList10.add("滋阴");
                smallSortList10.add("壮阳");
                smallSortList10.add("便秘");
                smallSortList10.add("排毒养颜");
                smallSortList10.add("滋润补水");
                smallSortList10.add("健脾养胃");
                smallSortList10.add("护肝明目");
                smallSortList10.add("清肺止咳");
                smallSortList10.add("下奶");
                smallSortList10.add("补钙");
                smallSortList10.add("醒酒");
                smallSortList10.add("抗过敏");
                smallSortList10.add("防辐射");



            }
            else if(i==11)
            {
                bigSortList11.add("口味");
                bigSortList.add("口味");


                smallSortList11.add("微辣");
                smallSortList11.add("中辣");
                smallSortList11.add("超辣");
                smallSortList11.add("麻辣");
                smallSortList11.add("酸辣");
                smallSortList11.add("酸甜");
                smallSortList11.add("酸咸");
                smallSortList11.add("咸鲜");
                smallSortList11.add("咸甜");
                smallSortList11.add("甜味");
                smallSortList11.add("苦味");
                smallSortList11.add("原味");
                smallSortList11.add("清淡");
                smallSortList11.add("五香");
                smallSortList11.add("鱼香");
                smallSortList11.add("葱香");
                smallSortList11.add("蒜香");



            }
            else if(i==12)
            {
                bigSortList12.add("烹饪方式");
                bigSortList.add("烹饪方式");

                smallSortList12.add("烧");
                smallSortList12.add("炒");
                smallSortList12.add("爆");
                smallSortList12.add("焖");
                smallSortList12.add("炖");
                smallSortList12.add("蒸");
                smallSortList12.add("煮");
                smallSortList12.add("拌");
                smallSortList12.add("烤");
                smallSortList12.add("炸");
                smallSortList12.add("溜");
                smallSortList12.add("腌");
                smallSortList12.add("卤");
                smallSortList12.add("煎");


            }
            else if(i==13)
            {
                bigSortList13.add("烹饪时间");
                bigSortList.add("烹饪时间");


                smallSortList13.add("十分钟");
                smallSortList13.add("半小时");
                smallSortList13.add("三刻钟");
                smallSortList13.add("一小时");
                smallSortList13.add("数小时");
                smallSortList13.add("一天");
                smallSortList13.add("数天");




            }
            else if(i==14)
            {
                bigSortList14.add("家常菜");
                bigSortList.add("家常菜");

                smallSortList14.add("茶叶蛋");
                smallSortList14.add("水煮鱼");
                smallSortList14.add("龙井虾仁");
                smallSortList14.add("口水鸡");
                smallSortList14.add("回锅肉");
                smallSortList14.add("红烧猪蹄");
                smallSortList14.add("糖醋排骨");
                smallSortList14.add("皮蛋瘦肉粥");
                smallSortList14.add("酸菜鱼");
                smallSortList14.add("鱼香肉丝");
                smallSortList14.add("咖喱牛肉");
                smallSortList14.add("西红柿炒鸡蛋");
                smallSortList14.add("葡萄酒");
                smallSortList14.add("红烧鱼");
                smallSortList14.add("蛋炒饭");
                smallSortList14.add("水煮肉片");
                smallSortList14.add("奶茶");
            }


            i++;

        }}





    private void initView() {

        leftRecyclerView = (RecyclerView)view.findViewById(R.id.rv_sort_left) ;
        rightRecyclerView1= (RecyclerView)view.findViewById(R.id.rv_sort_right);
        rightRecyclerView2= (RecyclerView) view.findViewById(R.id.rv_sort_right);
        rightRecyclerView3= (RecyclerView)view.findViewById(R.id.rv_sort_right);
       //leftLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
       leftLayoutManager = new LinearLayoutManager(getContext()

               , LinearLayoutManager.VERTICAL, false);
    //   StaggeredGridLayoutManager leftLayoutManager=new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        leftRecyclerView.setLayoutManager(leftLayoutManager);
        leftAdapter = new LeftRecyclerAdapter(this, bigSortList, leftRecyclerView);
        //左侧列表的点击事件

        leftAdapter.setItemClickListener(new LeftRecyclerAdapter.LeftListener() {
            @Override
            public void onItemClick(int position) {
                //向适配器中返回点击的位置，在适配器中进行操作
                leftAdapter.getSelectedPosition(position);
                if(position==0){ rightAdapter1 = new RightRecyclerAdapter(getActivity(), bigSortList0,smallSortList0, rightRecyclerView1);
                    rightRecyclerView1.setAdapter(rightAdapter1);
                    rightRecyclerView1.setLayoutManager(rightLayoutManager);

                }
                //             rightAdapter0 = new RightRecyclerAdapter(getApplicationContext(), bigSortList,smallSortList0, rightRecyclerView);
                if(position==1){ rightAdapter1 = new RightRecyclerAdapter(getActivity(), bigSortList1,smallSortList1, rightRecyclerView1);
                    rightRecyclerView1.setAdapter(rightAdapter1);
                    rightRecyclerView1.setLayoutManager(rightLayoutManager);

                }
                else if(position==2) {rightAdapter2 = new RightRecyclerAdapter(getActivity(), bigSortList2,smallSortList2, rightRecyclerView2);
                    rightRecyclerView2.setAdapter(rightAdapter2);
                    rightRecyclerView2.setLayoutManager(rightLayoutManager);
                }
                else if(position==3) {rightAdapter3 = new RightRecyclerAdapter(getActivity(), bigSortList3,smallSortList3, rightRecyclerView3);
                    rightRecyclerView3.setAdapter(rightAdapter3);
                    rightRecyclerView3.setLayoutManager(rightLayoutManager);
                }
                //                rightLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
                //                rightRecyclerView.setLayoutManager(rightLayoutManager);
                else if(position==4) {rightAdapter3 = new RightRecyclerAdapter(getActivity(), bigSortList4,smallSortList4, rightRecyclerView3);
                    rightRecyclerView3.setAdapter(rightAdapter3);
                    rightRecyclerView3.setLayoutManager(rightLayoutManager);
                }
                else if(position==5) {rightAdapter3 = new RightRecyclerAdapter(getActivity(), bigSortList5,smallSortList5, rightRecyclerView3);
                    rightRecyclerView3.setAdapter(rightAdapter3);
                    rightRecyclerView3.setLayoutManager(rightLayoutManager);
                }
                else if(position==6) {rightAdapter3 = new RightRecyclerAdapter(getActivity(), bigSortList6,smallSortList6, rightRecyclerView3);
                    rightRecyclerView3.setAdapter(rightAdapter3);
                    rightRecyclerView3.setLayoutManager(rightLayoutManager);
                }
                else if(position==7) {rightAdapter3 = new RightRecyclerAdapter(getActivity(), bigSortList7,smallSortList7, rightRecyclerView3);
                    rightRecyclerView3.setAdapter(rightAdapter3);
                    rightRecyclerView3.setLayoutManager(rightLayoutManager);
                }
                else if(position==8) {rightAdapter3 = new RightRecyclerAdapter(getActivity(), bigSortList8,smallSortList8, rightRecyclerView3);
                    rightRecyclerView3.setAdapter(rightAdapter3);
                    rightRecyclerView3.setLayoutManager(rightLayoutManager);
                }

                else if(position==9) {rightAdapter3 = new RightRecyclerAdapter(getActivity(), bigSortList9,smallSortList9, rightRecyclerView3);
                    rightRecyclerView3.setAdapter(rightAdapter3);
                    rightRecyclerView3.setLayoutManager(rightLayoutManager);
                }

                else if(position==10) {rightAdapter3 = new RightRecyclerAdapter(getActivity(), bigSortList10,smallSortList10, rightRecyclerView3);
                    rightRecyclerView3.setAdapter(rightAdapter3);
                    rightRecyclerView3.setLayoutManager(rightLayoutManager);
                }

                else if(position==11) {rightAdapter3 = new RightRecyclerAdapter(getActivity(), bigSortList11,smallSortList11, rightRecyclerView3);
                    rightRecyclerView3.setAdapter(rightAdapter3);
                    rightRecyclerView3.setLayoutManager(rightLayoutManager);
                }

                else if(position==12) {rightAdapter3 = new RightRecyclerAdapter(getActivity(), bigSortList12,smallSortList12, rightRecyclerView3);
                    rightRecyclerView3.setAdapter(rightAdapter3);
                    rightRecyclerView3.setLayoutManager(rightLayoutManager);
                }

                else if(position==13) {rightAdapter3 = new RightRecyclerAdapter(getActivity(), bigSortList13,smallSortList13, rightRecyclerView3);
                    rightRecyclerView3.setAdapter(rightAdapter3);
                    rightRecyclerView3.setLayoutManager(rightLayoutManager);
                }

                else if(position==14) {rightAdapter3 = new RightRecyclerAdapter(getActivity(), bigSortList14,smallSortList14, rightRecyclerView3);
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
        ////                                              if(position==0) rightAdapter = new RightRecyclerAdapter(getApplicationContext(), bigSortList,smallSortList0, rightRecyclerView);
        //                                                 if(position==1) rightAdapter = new RightRecyclerAdapter(getApplicationContext(), bigSortList,smallSortList1, rightRecyclerView);
        //                                                 if(position==2) rightAdapter = new RightRecyclerAdapter(getApplicationContext(), bigSortList,smallSortList2, rightRecyclerView);
        //                                                 if(position==3) rightAdapter = new RightRecyclerAdapter(getApplicationContext(), bigSortList,smallSortList3, rightRecyclerView);
        //                                                 if(position==4) rightAdapter = new RightRecyclerAdapter(getApplicationContext(), bigSortList,smallSortList4, rightRecyclerView);
        //                                             }
        //                                         });

        //




       rightLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
     //   StaggeredGridLayoutManager rightLayoutManager=new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);





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



