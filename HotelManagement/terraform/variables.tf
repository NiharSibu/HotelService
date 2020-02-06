variable "key_name" {
  default = "new key"
}

variable "pvt_key" {
  default = "/root/.ssh/newkey.pem"
}

variable "us-east-zones" {
  default = ["us-east-1a", "us-east-1b"]
}

variable "sg-id" {
  default = "sg-04fdc62e186bdae8e"
}
