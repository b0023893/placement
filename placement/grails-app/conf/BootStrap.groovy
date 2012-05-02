import placement.*
class BootStrap {

    def init = { servletContext ->
        def newone = new Student (name:'John', coursecode:'1001', notes:'none', application:'none') .save();
        def newtwo = new Status (code: '12345', description: 'none') .save();
        def newthree = new Placement (jobTitle:'Assistant', companyName: 'PC world', applications:'none', status:'none') .save();
        //def newfour = new Application ( student: status: placement: timestamp: ) .save();
    }
    def destroy = {
    }
}
