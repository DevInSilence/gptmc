FROM ubuntu:22.04

ENV DEBIAN_FRONTEND=noninteractive

RUN apt-get update && apt-get install -y \
    curl \
    zip \
    unzip \
    git \
    wget \
    ca-certificates \
    build-essential \
    zsh \
 && apt-get clean \
 && rm -rf /var/lib/apt/lists/*

RUN chsh -s $(which zsh)
RUN sh -c "$(curl -fsSL https://raw.githubusercontent.com/ohmyzsh/ohmyzsh/master/tools/install.sh)" "" --unattended

RUN curl -s "https://get.sdkman.io" | bash && \
    bash -c "source $HOME/.sdkman/bin/sdkman-init.sh && \
    sdk install java 21.0.2-open && \
    sdk use java 21.0.2-open && \
    sdk install gradle 8.8 && \
    sdk use gradle 8.8"

WORKDIR /workspace

CMD ["/bin/zsh", "-i"]
