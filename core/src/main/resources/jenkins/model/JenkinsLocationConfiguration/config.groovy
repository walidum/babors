package jenkins.model.JenkinsLocationConfiguration

import hudson.Functions

def f=namespace(lib.FormTagLib)

f.section(title:_("Jenkins Location")) {
    f.entry(title:_("Babors URL"), field:"url") {
        f.textbox(default: Functions.inferHudsonURL(request))
    }
    f.entry(title:_("System Admin e-mail address"), field:"adminAddress") {
        f.textbox()
    }
}
