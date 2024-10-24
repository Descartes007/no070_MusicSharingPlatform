const base = {
    get() {
                return {
            url : "http://localhost:8080/springbootc8hzm/",
            name: "springbootc8hzm",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootc8hzm/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "音乐翻唱与分享平台"
        } 
    }
}
export default base
