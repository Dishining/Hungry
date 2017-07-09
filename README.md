# Hungry
## 架构
* Web `web2017`
 * `enter.html`进入页面 定时三秒钟显示slogan以及一张动图
 * `happyJune.jsp`主页 包括菜单栏以及所有菜品展示
 * `success.jsp`加入订单成功页面 获取主页传来的值并将数据库中对应的tag赋值
 * `order.jsp`查看订单页面 从数据库中提取已选择的菜品并显示
 * `success1.jsp`下单成功页面 并将数据库中tag赋空
 * `echarts/`查看卡路里页面 用echarts做的图表显示吃完相应菜品需要的运动量
* Java src/..
 * `datautil.java`进行数据库的连接以及存取修改操作

