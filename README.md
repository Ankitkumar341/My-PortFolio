# My Portfolio Project

Full-stack portfolio project with microfrontend architecture using Turborepo for efficient monorepo management.

## 🚀 Quick Start

```bash
# Install dependencies
pnpm install

# Run all apps in development
pnpm run dev

# Build all apps
pnpm run build
```

## 📦 Apps & Packages

### Applications
- **admin** - Angular admin dashboard with SSR
- **portfolio** - Next.js portfolio website  
- **backend** - Spring Boot REST API _(not included in repo yet)_

### Shared Packages
- `@repo/ui` - Shared React components
- `@repo/eslint-config` - ESLint configurations
- `@repo/typescript-config` - TypeScript configurations

## ✨ Features

- 🏗️ **Turborepo** - Fast, efficient monorepo build system
- 🧩 **Microfrontends** - Independent, scalable frontend apps
- 📦 **pnpm Workspaces** - Fast, disk-efficient package management
- ⚡ **Hot Reload** - All apps support instant development feedback
