import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import discussyinlefanchang from '@/views/modules/discussyinlefanchang/list'
    import yinlefanchang from '@/views/modules/yinlefanchang/list'
    import discusszaixiantingge from '@/views/modules/discusszaixiantingge/list'
    import zaixiantingge from '@/views/modules/zaixiantingge/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import discussyinlezixun from '@/views/modules/discussyinlezixun/list'
    import yinlezixun from '@/views/modules/yinlezixun/list'
    import messages from '@/views/modules/messages/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/discussyinlefanchang',
        name: '音乐翻唱评论',
        component: discussyinlefanchang
      }
          ,{
	path: '/yinlefanchang',
        name: '音乐翻唱',
        component: yinlefanchang
      }
          ,{
	path: '/discusszaixiantingge',
        name: '在线听歌评论',
        component: discusszaixiantingge
      }
          ,{
	path: '/zaixiantingge',
        name: '在线听歌',
        component: zaixiantingge
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/chat',
        name: '客服管理',
        component: chat
      }
          ,{
	path: '/discussyinlezixun',
        name: '音乐资讯评论',
        component: discussyinlezixun
      }
          ,{
	path: '/yinlezixun',
        name: '音乐资讯',
        component: yinlezixun
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
