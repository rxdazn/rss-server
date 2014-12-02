# -*- mode: ruby -*-
# vi: set ft=ruby :

# Vagrantfile API/syntax version. Don't touch unless you know what you're doing!
VAGRANTFILE_API_VERSION = "2"

VAGRANT_COMMAND = ARGV[0]

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  config.vm.box = "chef/debian-7.7"
  config.vm.network :private_network, ip: "192.168.1.42"
  config.vm.network "forwarded_port", guest: 8080, host: 8080
  config.vm.network "forwarded_port", guest: 8888, host: 8888
  config.vm.network "forwarded_port", guest: 9090, host: 9090

  if VAGRANT_COMMAND == "ssh"
    config.ssh.username = "tomcat"
    config.ssh.password = "tomcat"
  end

  config.vm.synced_folder "web-api/", "/usr/share/tomcat/rss-server/web-api/",
    create: true, owner: "tomcat", group: "tomcat"

  config.vm.provision "ansible" do |ansible|
    ansible.playbook = "ansible/playbook.yml"
    ansible.inventory_path = "ansible/hosts"
    ansible.limit = "all"
  end
end
